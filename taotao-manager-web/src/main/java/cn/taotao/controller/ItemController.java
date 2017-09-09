package cn.taotao.controller;

import cn.taotao.pojo.TbItem;
import cn.taotao.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description: 商品信息管理
 * @author little dragon
 * @date 2017/9/6
**/
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private IItemService iItemService;

    @RequestMapping("/select/{itemId}")
    @ResponseBody
    public TbItem findItem(@PathVariable Long itemId){
        return iItemService.selectItemById(itemId);
    }

}
