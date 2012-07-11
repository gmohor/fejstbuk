package org.openblend.fejstbuk.domain;

import javax.persistence.Entity;

/**
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
@Entity
public class Status extends Linked {
    private String status;

    public Status(String status) {
        this.status = status;
    }

    public Status() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
