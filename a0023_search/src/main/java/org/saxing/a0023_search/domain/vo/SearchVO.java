package org.saxing.a0023_search.domain.vo;

import org.saxing.a0023_search.domain.entity.PageParam;

/**
 * @author saxing 2019/1/22 10:20
 */
@Data
public class SearchVO extends PageParam {
    private static final long serialVersionUID = 8506284080778757036L;

    private String keyword;

}
