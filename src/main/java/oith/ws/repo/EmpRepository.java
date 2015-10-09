package oith.ws.repo;

import oith.ws.dom.hcm.Emp;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Emp, String> {

    public Emp findByCode(String code);
}
