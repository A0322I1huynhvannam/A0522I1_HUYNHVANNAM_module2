package ss04_lop_doi_tuong_java.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
        private double width, height;

        public HinhChuNhat() {
        }

        public HinhChuNhat(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }
    }
