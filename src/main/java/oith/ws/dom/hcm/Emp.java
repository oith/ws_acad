package oith.ws.dom.hcm;

import java.util.Date;
import java.util.Set;
import javax.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import oith.ws.dom.core.AbstDocAttach;
import oith.ws.dom.core.ICodable;

@Document(collection = "Emp")
public class Emp extends AbstDocAttach implements ICodable {

    @NotNull
    @Indexed(unique = true)
    private String code;
    @NotNull
    private Date doj;

    private Set<EmpContactPerson> empContactPersons;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Set<EmpContactPerson> getEmpContactPersons() {
        return empContactPersons;
    }

    public void setEmpContactPersons(Set<EmpContactPerson> empContactPersons) {
        this.empContactPersons = empContactPersons;
    }

}
