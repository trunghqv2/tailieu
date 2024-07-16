class NhanVien {
    public void tinhLuong() {
        System.out.println("dang tinh luowng cho nhan vien");
    }
}

class NhanVienThuong extends NhanVien {
    @Override
    public void tinhLuong() {
        System.out.println("dang tinh luowng cho nhan vien thuong ");
    }
}

class NhanVienVanPhong extends NhanVien {
    @Override
    public void tinhLuong() {
        System.out.println("dang tinh luowng cho nhan vien van phong ");
    }
}

public class dahinh {
    public static void main(String[] args) {
        NhanVien nhanVienThuong = new NhanVienThuong();
        NhanVien nhanVienVanPhong = new NhanVienVanPhong();
      
        nhanVienThuong.tinhLuong();
        nhanVienVanPhong.tinhLuong();
    }
}