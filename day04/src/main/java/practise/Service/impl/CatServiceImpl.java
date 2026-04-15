package practise.Service.impl;

import practise.Service.CatService;
import practise.entity.Cat;

public class CatServiceImpl extends AnimalServiceImpl implements CatService{

    @Override
    // Write 这个名字太泛了，看不出是做什么的。
    public void Write(Cat cat) {
        eatFood(cat);
        actionMove(cat);
        setName(cat);
        // 这里现在主要是在拼字符串输出。
        System.out.println(cat.getMaster()+"给"+setName(cat)+actionMove(cat)+eatFood(cat));
    }
}