package org.bugkillers.core.dao;

import org.bugkillers.core.domain.QuestionTagDO;
import org.bugkillers.core.enums.DataValidEnum;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/22.
 */
public class QuestionTagDOMapperTest extends AbstractJunitTest {

    @Autowired
    private QuestionTagDOMapper questionTagDOMapper;

    @Test
    public void insertTest() {
        QuestionTagDO questionTagDO = new QuestionTagDO();
        questionTagDO.setTagId(1);
        questionTagDO.setTagName("Java");
        questionTagDO.setQuestionId(1);
        questionTagDO.setBkModified(new Date());
        questionTagDO.setBkCreate(new Date());
        questionTagDO.setDr(DataValidEnum.VALID.getIndex());
        questionTagDOMapper.insert(questionTagDO);
        Assert.assertTrue(true);
    }

    @Test
    public void insertTest02() {
        QuestionTagDO questionTagDO = new QuestionTagDO();
        questionTagDO.setTagId(2);
        questionTagDO.setTagName("Spring");
        questionTagDO.setQuestionId(1);
        questionTagDO.setBkModified(new Date());
        questionTagDO.setBkCreate(new Date());
        questionTagDO.setDr(DataValidEnum.VALID.getIndex());
        questionTagDOMapper.insert(questionTagDO);
        Assert.assertTrue(true);
    }



}
