import java.time.LocalDate;

public class Employee {
    private String id;
    private String ten;
    private LocalDate ngaysinh;
    private String gioitinh;

    private double luong;

    public String getId() {
        return id;
    }

    public Employee() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "\t ID: " + id +
                "\t Tên nhân viên: " + ten +
                "\t Ngày Sinh: " + ngaysinh +
                "\t Giới Tính: '" + gioitinh +
                "\t luong=" + luong +
                ' ';
    }
}

