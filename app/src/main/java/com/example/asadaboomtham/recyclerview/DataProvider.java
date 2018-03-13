package com.example.asadaboomtham.recyclerview;

/**
 * Created by asada boomtham on 13/3/2561.
 */

public class DataProvider {

    public DataProvider(int img_res, String book_name, String book_price) {

        this.setBook_name(book_name);
        this.setBook_price(book_price);
        this.setImg_res(img_res);
    }

    private int img_res;

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_price() {
        return book_price;
    }

    public void setBook_price(String book_price) {
        this.book_price = book_price;
    }

    private String book_name, book_price;
}
