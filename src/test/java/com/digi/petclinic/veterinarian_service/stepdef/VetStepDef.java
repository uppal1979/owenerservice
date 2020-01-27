package com.digi.petclinic.veterinarian_service.stepdef;

import com.digi.petclinic.veterinarian_service.dao.VetRepository;
import com.digi.petclinic.veterinarian_service.entity.Vet;
import com.digi.petclinic.veterinarian_service.pojo.VetTestPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


@ContextConfiguration
@SpringBootTest
@ActiveProfiles("test")
public class VetStepDef {


    @Autowired
    VetRepository vetRepository;

    private List<Vet> vetList = new ArrayList<>();
    private int count = 0;

    @Given("^Jonn search for veterinarian available$")
    public void jonn_search_for_veterinarian_available() throws Throwable {

        vetList = vetRepository.findAll();
    }

    @Then("^John should get the veterinarian as$")
    public void john_should_get_the_veterinarian_as(List<VetTestPojo> testVetList) throws Throwable {

        vetList.forEach(vet -> {
            assertThat(vet.getFirstName(), is(testVetList.get(count).getFirstName()));
            {
                vet.getSpecialties().forEach(speciality -> {

                    assertThat(speciality.getName(), is(testVetList.get(count).getSpecialties()));
                });
            }
            count++;

        });
    }

}
