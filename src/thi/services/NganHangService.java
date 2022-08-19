package thi.services;


import thi.controllers.NotFoundBankAcountException;
import thi.models.NganHang;
import thi.util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class NganHangService {
    private static List<NganHang> nganHangs = new ArrayList<>();
    private static final String PATH = "src\\thi\\data\\nam.csv";
    private static FileHelper fileHelper = new FileHelper();

    public static void add(NganHang nganHang) {
        int lastID = 0;
        if (nganHangs.size() >0){
             lastID = Integer.parseInt(nganHangs.get(nganHangs.size() - 1).getiDTaiKhoan());
        }
        nganHang.setiDTaiKhoan(lastID + 1);
        nganHangs.add(nganHang);
        fileHelper.writer(PATH,nganHangs,true);
    }

    public static void delete(int id) throws NotFoundBankAcountException {
        for (int i = 0;i<nganHangs.size();i++){
            nganHangs.remove(i);
            fileHelper.writer(PATH,nganHangs,false);
            return;
        }
        throw new NotFoundBankAcountException(id + "The ngan hang khong ton tai");
    }


    public static List<NganHang> findAll(){
        return nganHangs;
    }
}
