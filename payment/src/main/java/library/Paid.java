package LIBRARY;

public class Paid extends AbstractEvent {

    private Long id;
    private Long approveNo;
    private Date approveDate;

    public Paid(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getApproveNo() {
        return approveNo;
    }

    public void setApproveNo(Long approveNo) {
        this.approveNo = approveNo;
    }
    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }
}