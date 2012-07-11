package org.openblend.fejstbuk.ui;

import org.openblend.fejstbuk.domain.Status;
import org.openblend.fejstbuk.domain.User;
import org.openblend.fejstbuk.qualifiers.LoggedIn;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:tomaz.cerar@redhat.com">Tomaz Cerar</a>
 */
@Stateless
public class NewsAction {
    @PersistenceContext
    private EntityManager em;


    @Inject
    @LoggedIn
    private User user;


    @Produces
    @Named

    public List<Status> getNewsFeed() {
        List<Status> list = new ArrayList<Status>();
        list.add(new Status("Hello"));
        list.add(new Status("yello"));
        list.add(new Status("pozdravljen"));
        list.add(new Status("danes je lep dan"));
        list.add(new Status("toča bo nekoč"));
        return list;

    }

}
