package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeSearchService {

    private EmployeeDao employeeDao;
    private CompanyDao companyDao;

    @Autowired
    public FacadeSearchService(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }


    public List<Company> findCompanyByPartOfTheName(String fragment) {
        return companyDao.findCompanyByPartOfTheName(fragment);
    }

    public List<Employee> findEmployeeByPartOfTheLastname(String fragment) {
        return employeeDao.findEmployeeByPartOfTheLastname(fragment);
    }

}
