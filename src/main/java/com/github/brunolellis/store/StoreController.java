package com.github.brunolellis.store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * A Spring MVC controller to produce an HTML frontend.
 *
 * @author Oliver Gierke
 */
@RestController
@RequestMapping("/api/stores")
class StoresController {

    private final StoreRepository stores;

    @Autowired
    public StoresController(StoreRepository stores) {
        this.stores = stores;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public Page<Store> search(@RequestParam("q") String query, Pageable pageable) {
        Page<Store> lojas = stores.findByName(query, pageable);
        System.out.println(lojas);

        return lojas;
    }
}
