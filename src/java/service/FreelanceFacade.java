/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Freelance;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fatima
 */
@Stateless
public class FreelanceFacade extends AbstractFacade<Freelance> {

    @PersistenceContext(unitName = "freelanceApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FreelanceFacade() {
        super(Freelance.class);
    }
    
}
