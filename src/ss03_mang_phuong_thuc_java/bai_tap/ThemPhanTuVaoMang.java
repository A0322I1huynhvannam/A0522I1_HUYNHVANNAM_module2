package ss03_mang_phuong_thuc_java.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang :");
        int n= scanner.nextInt();
        int [] arr =new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for(int i=0;i<n;i++){
            System.out.printf("a[%d=", i);
            arr[i]=scanner.nextInt();
        }
        System.out.println("Nhap phan tu k =");
        int k = scanner.nextInt();
    }
}

