package br.com.tria.controller;

import br.com.tria.service.EquipamentoService;
import br.com.tria.service.dto.DepositoDto;
import br.com.tria.service.dto.EquipamentoDto;
import br.com.tria.service.dto.EquipamentoFilterDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipamentoControllerIntegrationTest {
    @Autowired
    private WebApplicationContext context;

    @Autowired
    private EquipamentoService equipamentoService;

    private MockMvc mvc;

    private EquipamentoDto getEquipamentoDto() {
        DepositoDto depositoDto = new DepositoDto();
        depositoDto.setId(1L);

        return new EquipamentoDto(
                0L,
                "123",
                "ABC",
                1.0,
                "A1",
                depositoDto
        );
    }

    private EquipamentoFilterDto getEquipamentoFilterDto() {
        return new EquipamentoFilterDto("SJC");
    }

    private final String URL = "/api/equipamento/";
    private final int PAGE = 0;
    private final int SIZE = 20;

    private static byte[] convertObjectToJsonBytes(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        JavaTimeModule module = new JavaTimeModule();
        mapper.registerModule(module);

        return mapper.writeValueAsBytes(object);
    }

    @Before
    public void setUp() {
        this.mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void test01_saveSuccess() throws Exception {
        this.mvc.perform(post(URL)
                .content(convertObjectToJsonBytes(this.getEquipamentoDto()))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    @Test
    public void test02_findAllSuccess() throws Exception {
        this.mvc.perform(get(URL + "?page=" + PAGE + "&size="+ SIZE))
                .andExpect(status().isOk());
    }

    @Test
    public void test03_filterSuccess() throws Exception {
        this.mvc.perform(post(URL + "filter")
                .content(convertObjectToJsonBytes(this.getEquipamentoFilterDto()))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}