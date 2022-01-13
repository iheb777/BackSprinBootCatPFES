package tn.cybertrace.projetpfecat.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.cybertrace.projetpfecat.dao.CatDao;
import tn.cybertrace.projetpfecat.dao.PdeDao;
import tn.cybertrace.projetpfecat.model.Pfe;
import tn.cybertrace.projetpfecat.model.TypePfe;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class RestPfe {

    @Autowired
    private PdeDao pdeDao;
    @Autowired
    private CatDao catDao;


    @RequestMapping(value = "/getallpfe")
    public List<Pfe> getAll() {
        return pdeDao.getall();
    }

    @PostMapping(value = "/addpfe", consumes = {"application/json"})
    public Pfe create(@RequestBody Pfe pfe) {

    //    System.out.println("---------------->"+pfe.toString());
        return pdeDao.save(pfe);
    }

    @RequestMapping(value = "/deletepfe/{pfeid}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "pfeid") int id) {
        pdeDao.delete(pdeDao.getById(id));
    }

    @RequestMapping(value = "/getbycatpfe/{catid}")
    public List<Pfe> getbyCat(@PathVariable(value = "catid") int id) {
        return pdeDao.getPfesBycat(id);
    }

    @RequestMapping(value = "/getallcat")
    public List<TypePfe> getAllcat() {
        return catDao.findAll();
    }

    @RequestMapping(value = "/getonecat/{id}")
    public String getonecat(@PathVariable(value = "id") int id) {
        return catDao.findById(id).get().getLabel();
    }

    @RequestMapping(value = "/getresultsearch/{sh}")
    public List<Pfe> getsearch(@PathVariable(value = "sh") String sh) {
        return pdeDao.findPfeByTitreContains(sh);
    }
}



