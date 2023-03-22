
import javax.persistence.*;

@Entity
@Table(name = "chi_tiet_san_pham")
public class ChiTietSanPham {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "sanpham_id")
    private Integer sanphamId;

    @Column(name = "nsx_id")
    private Integer nsxId;

    @Column(name = "mausac_id")
    private Integer mausacId;

    @Column(name = "dongsanpham_id")
    private Integer dongsanphamId;

    @Column(name = "nam_bao_hanh")
    private Integer namBaoHanh;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @Column(name = "gia_nhap")
    private BigDecimal giaNhap;

    @Column(name = "gia_ban")
    private BigDecimal giaBan;

    @Column(name = "anh")
    private String anh;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSanphamId() {
        return this.sanphamId;
    }

    public void setSanphamId(Integer sanphamId) {
        this.sanphamId = sanphamId;
    }

    public Integer getNsxId() {
        return this.nsxId;
    }

    public void setNsxId(Integer nsxId) {
        this.nsxId = nsxId;
    }

    public Integer getMausacId() {
        return this.mausacId;
    }

    public void setMausacId(Integer mausacId) {
        this.mausacId = mausacId;
    }

    public Integer getDongsanphamId() {
        return this.dongsanphamId;
    }

    public void setDongsanphamId(Integer dongsanphamId) {
        this.dongsanphamId = dongsanphamId;
    }

    public Integer getNamBaoHanh() {
        return this.namBaoHanh;
    }

    public void setNamBaoHanh(Integer namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return this.soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return this.giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return this.giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public String getAnh() {
        return this.anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
