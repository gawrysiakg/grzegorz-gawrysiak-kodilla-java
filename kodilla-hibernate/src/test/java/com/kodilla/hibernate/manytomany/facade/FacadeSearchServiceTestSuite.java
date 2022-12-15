package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FacadeSearchServiceTestSuite {

    @Autowired
    private FacadeSearchService facadeSearchService;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void findCompanyByPartOfTheNameTest() {
        //Given
        Company apple = new Company("Apple");
        Company microsoft = new Company("Microsoft");
        Company ubisoft = new Company("Ubisoft");
        Company facebook = new Company("Facebook");
        Company allegro = new Company("Allegro");
        companyDao.save(apple);
        companyDao.save(microsoft);
        companyDao.save(ubisoft);
        companyDao.save(facebook);
        companyDao.save(allegro);
        //When
        List<Company> facadeResult = facadeSearchService.findCompanyByPartOfTheName("oft");
        //Then
        Assertions.assertEquals(2, facadeResult.size());
        //CleanUp
        companyDao.delete(apple);
        companyDao.delete(microsoft);
        companyDao.delete(ubisoft);
        companyDao.delete(facebook);
        companyDao.delete(allegro);
    }



    @Test
    public void findEmployeeByPartOfTheLastnameTest() {
        //Given
        Employee lewandowski = new Employee("Robert", "Lewandowski");
        Employee szczesny = new Employee("Wojciech", "Szczęsny");
        Employee swiderski = new Employee("Karol", "Świderski");
        Employee blaszczykowski = new Employee("Jakub", "Błaszczykowski");
        employeeDao.save(lewandowski);
        employeeDao.save(szczesny);
        employeeDao.save(swiderski);
        employeeDao.save(blaszczykowski);
        //When
        List<Employee> facadeResult = facadeSearchService.findEmployeeByPartOfTheLastname("ski");
        //Then
        Assertions.assertEquals(3, facadeResult.size());
        //CleanUp
        employeeDao.delete(lewandowski);
        employeeDao.delete(szczesny);
        employeeDao.delete(swiderski);
        employeeDao.delete(blaszczykowski);
    }



}
