package com.testdi.bean;

/**
 *
 * Created by thomas on 2017/7/19.
 */
public class BraveKnight
{
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void emarkOnQuest()
    {
        quest.embark();
    }
}
