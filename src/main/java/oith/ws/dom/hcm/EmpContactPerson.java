package oith.ws.dom.hcm;

import oith.ws.dom.core.AbstEmbdDetail;
import oith.ws.dom.core.ContactPreson;

public class EmpContactPerson extends AbstEmbdDetail {

    public enum ContactPersonType {
        GRANTOR, NOMENEE, REFERANCE
    }

    private ContactPreson contactPreson;
    private ContactPersonType contactPersonType;

    public ContactPreson getContactPreson() {
        return contactPreson;
    }

    public void setContactPreson(ContactPreson contactPreson) {
        this.contactPreson = contactPreson;
    }

    public ContactPersonType getContactPersonType() {
        return contactPersonType;
    }

    public void setContactPersonType(ContactPersonType contactPersonType) {
        this.contactPersonType = contactPersonType;
    }

}
