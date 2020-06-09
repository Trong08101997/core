package nhatro.core.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TokenUser", schema = "nhatro", catalog = "")
public class TokenUserEntity {
    private int id;
    private Integer userId;
    private Timestamp timeCreate;
    private Timestamp timeUpdate;
    private String status;
    private Integer deviceId;
    private String token;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "time_create")
    public Timestamp getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Timestamp timeCreate) {
        this.timeCreate = timeCreate;
    }

    @Basic
    @Column(name = "time_update")
    public Timestamp getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "deviceId")
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenUserEntity that = (TokenUserEntity) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(timeCreate, that.timeCreate) &&
                Objects.equals(timeUpdate, that.timeUpdate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, timeCreate, timeUpdate, status, deviceId, token);
    }
}
