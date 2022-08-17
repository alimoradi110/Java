package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Library shahidHemat = new Library("Shahid Hemat");
        int formselected;

        do {
            System.out.println("lotfan yek gozineh ra entekhab befarmaeed:\n" + "1.sabte nam... \n" + "2.ketabe jadid \n" + "3.amanatgreftan ketab\n" + "4.bazgardandan ketab\n" + "5.khoroj.....");
            formselected = scanner.nextInt();

            switch (formselected) {
                case 1:
                    System.out.println("Name Khod ra  vared konid:");
                    String nameozvejadid = scanner.next();
                    System.out.println("sen khod ra vared konid:");
                    int age = scanner.nextInt();
                    Member member = new Member(nameozvejadid, age, shahidHemat);
                    break;
                case 2:
                    System.out.println("Name ketab ra vared konid:");
                    String namebook = scanner.next();
                    System.out.println("Name nevisande ketab ra vared konid:");
                    String aouturage = scanner.next();
                    System.out.println("Tedade safahate ketab ra vared konid:");
                    Integer pages = scanner.nextInt();
                    System.out.println("Gheimate ketab ra vared konid:");
                    Integer price = scanner.nextInt();
                    Book book = new Book(namebook, aouturage, pages, price, shahidHemat);
                    break;
                case 3:
                    System.out.println("Name ketab made nazar ra vared konid:");
                    System.out.println(shahidHemat.getAvailableBookNames());
                    String ketabeamani = scanner.next();
                    System.out.println("Name karbari khodra vared konid");
                    String namekarbari = scanner.next();
                    try {

                        for (Book book1 : shahidHemat.getAvailablebooks()) {
                            if (book1.getName().equals(ketabeamani)) {
                                for (Member member1 : shahidHemat.getMembers()) {
                                    if (member1.getName().equals(namekarbari)) {
                                        shahidHemat.lending(book1, member1);

                                    } else {
                                        System.out.println("karbar mojod nist");
                                    }
                                }
                            } else {
                                System.out.println("ketab mojod nist");
                            }
                        }

                    }catch (Exception e){};


                    break;
                case 4:
                   try {
                       System.out.println("Name ketab made nazar ra vared konid:");
                       String ketabebagardandehshode = scanner.next();
                       System.out.println("Name karbari khodra vared konid");
                       String namekarbari2 = scanner.next();
                       for (Book book1 : shahidHemat.getBrowedbooks()) {
                           if (book1.getName().equals(ketabebagardandehshode)) {

                               for (Member member1 : shahidHemat.getMembers()) {
                                   if (member1.getName().equals(namekarbari2)) {
                                       shahidHemat.restore(book1, member1);
                                   } else {
                                       System.out.println("karbar mojod nist");
                                   }
                               }

                           } else {
                               System.out.println("ketab mojod nist");
                           }
                       }
                   }catch (Exception e){};

                    break;
                case 5:
                    break;
                default:
                    System.err.println("lotfan beine gozineh haye mojod yeki ra entekhab konid?");


            }
        } while (formselected != 5);


//                Library shahidHemat = new Library("Shahid Hemat");
//        Member ali = new Member("Ali", 32, shahidHemat);
//        Member reza = new Member("reza", 32, shahidHemat);
//        Book bustan = new Book("Bustan", "sadi", 80, 110,shahidHemat);
//        Book golestan = new Book("golestan", "sadi", 80, 110,shahidHemat);
//        Book shahname = new Book("shahname", "sadi", 80, 110,shahidHemat);
//        Book cleancode = new Book("cleancode", "sadi", 80, 110,shahidHemat);
//        System.out.println(shahidHemat.getAvailableBookNames());
//        shahidHemat.lending(bustan, ali);
//        shahidHemat.lending(golestan, ali);
//        shahidHemat.lending(shahname, ali);
//        shahidHemat.lending(cleancode, ali);
//        shahidHemat.lending(cleancode, ali);
//
//
////        System.out.println(shahidHemat.getBrowedbooks());
////        System.out.println(shahidHemat.getAvailablebooks());
//
//        ali.browedBooks();
//        shahidHemat.restore(shahname, ali);
//        ali.browedBooks();
//


    }
}
