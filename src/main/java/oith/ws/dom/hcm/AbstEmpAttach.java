package oith.ws.dom.hcm;

import oith.ws.dom.core.*;
import javax.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.mapping.DBRef;

public abstract class AbstEmpAttach extends AbstDocAudit {

    @DBRef
    @NotNull
    private Emp emp;

    public AbstEmpAttach() {
    }

    public AbstEmpAttach(Emp emp) {
        this.emp = emp;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

}
