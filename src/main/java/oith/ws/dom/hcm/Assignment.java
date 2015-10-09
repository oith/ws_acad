package oith.ws.dom.hcm;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Assignment")
public class Assignment extends AbstEmpAttach {

    public enum EmpCat {

        CASUAL,
        CONTRACTUAL,
        DEPUTATIONIST,
        PERMANENT,
        PROBATIONARY,
        SUBSTITUTE,
        TEMPORARY,
        TRAINEE_APPRENTICE
    }

    
    @NotNull
    @DBRef
    private Dept dept;
    private Double basic;
    private Double gross;
    @NotNull
    private Date startDate;
    private Date endDate;
    @NotNull
    private EmpCat empCat;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public EmpCat getEmpCat() {
        return empCat;
    }

    public void setEmpCat(EmpCat empCat) {
        this.empCat = empCat;
    }

}
