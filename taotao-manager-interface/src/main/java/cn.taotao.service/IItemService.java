package cn.taotao.service;

import cn.taotao.pojo.TbItem;

/**
 * Description: 商品信息接口
 * @author little dragon
 * @date 2017/9/6
**/
public interface IItemService {

    TbItem selectItemById(Long itemId);

}
