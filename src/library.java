public class library {

        String bookName;
        String bookList[];
        String bookCategory;
        String language;
        int maxBookNumber;
        int publishedYear;
        int bookPrice;

        public void totalBookList(int maxBookNumber){
            bookList = new String[maxBookNumber];
            this.maxBookNumber = maxBookNumber;

            System.out.println(bookList);
// my plan was to limit the maximum number of books to be listed, but it is not working
}

        public void addBook (String bookCategory, String bookName, int publishedYear){
        bookList = new String[publishedYear];
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.publishedYear = publishedYear;

            System.out.println("\n" + bookName + "is added \n" + bookName + " is categorized as " + bookCategory + " book.");

            if (publishedYear < 1990)
                System.out.println(bookName + " is Old book.");
            else if (publishedYear < 2000)
                System.out.println(bookName + " is 90's book.");
            else System.out.println(bookName + " is Modern book.");
}

        public void language (String insertLanguage) {
            language = insertLanguage;
            System.out.println(bookName + " is written in " + language);
        }


            public void setBookPrice (int price){
            bookPrice = price;
                double discount = bookPrice *0.85;
                if (bookPrice >= 500)

                System.out.println(bookName + " is 15% discounted. The price is " + discount + " Thank you.");

                else
                    System.out.println("The price is " + bookPrice + " Thank you.");

                double programmerDiscount = bookPrice * 0.80;
                if (bookCategory == "Coding")

                System.out.println("For programmers we offer a special discount of 20%. The price for " + bookName + " is "+ programmerDiscount);

            }


    }
