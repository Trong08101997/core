package nhatro.core.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "nhatro", catalog = "")
public class UserEntity {
    private int id;
    private String username;
    private String sdt;
    private String email;
    private String hovaten;
    private String avatar;
    private Timestamp ngaysinh;
    private Integer gioitinh;
    private String hashkey;
    private String cmnd;
    private String quequan;
    private String idfacebook;
    private Integer status;
    private Integer checkotp;
    private Integer otp;
    private Timestamp timecreateotp;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "sdt")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "hovaten")
    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "ngaysinh")
    public Timestamp getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Timestamp ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Basic
    @Column(name = "gioitinh")
    public Integer getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Integer gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Basic
    @Column(name = "hashkey")
    public String getHashkey() {
        return hashkey;
    }

    public void setHashkey(String hashkey) {
        this.hashkey = hashkey;
    }

    @Basic
    @Column(name = "cmnd")
    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Basic
    @Column(name = "quequan")
    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Basic
    @Column(name = "idfacebook")
    public String getIdfacebook() {
        return idfacebook;
    }

    public void setIdfacebook(String idfacebook) {
        this.idfacebook = idfacebook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(sdt, that.sdt) &&
                Objects.equals(email, that.email) &&
                Objects.equals(hovaten, that.hovaten) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(ngaysinh, that.ngaysinh) &&
                Objects.equals(gioitinh, that.gioitinh) &&
                Objects.equals(hashkey, that.hashkey) &&
                Objects.equals(cmnd, that.cmnd) &&
                Objects.equals(quequan, that.quequan) &&
                Objects.equals(idfacebook, that.idfacebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, sdt, email, hovaten, avatar, ngaysinh, gioitinh, hashkey, cmnd, quequan, idfacebook);
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "checkotp")
    public Integer getCheckotp() {
        return checkotp;
    }

    public void setCheckotp(Integer checkotp) {
        this.checkotp = checkotp;
    }

    @Basic
    @Column(name = "otp")
    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    @Basic
    @Column(name = "timecreateotp")
    public Timestamp getTimecreateotp() {
        return timecreateotp;
    }

    public void setTimecreateotp(Timestamp timecreateotp) {
        this.timecreateotp = timecreateotp;
    }
}
