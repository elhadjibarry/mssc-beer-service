package guru.springframework.msscbeerservice.web.model;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class BeerPagedList extends PageImpl<BeerDto> implements Serializable {
    
    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }
}
