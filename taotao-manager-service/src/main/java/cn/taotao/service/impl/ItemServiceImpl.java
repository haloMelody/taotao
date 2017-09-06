package cn.taotao.service.impl;

import cn.taotao.mapper.TbItemMapper;
import cn.taotao.pojo.TbItem;
import cn.taotao.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 商品信息接口实现类
 * @author little dragon
 * @date 2017/9/6
**/
@Service
public class ItemServiceImpl implements IItemService{

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem selectItemById(Long itemId) {
        return itemMapper.selectByPrimaryKey(itemId);
    }
}
