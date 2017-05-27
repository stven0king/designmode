package com.tzx.flyweight;

/**
 * Created by tanzhenxing on 17-5-27.
 *
 * 享元模式（Flywight），运用共享技术有效地支持大量细粒度的对象。
 *
 * 抽象享元（Flyweihgt）角色:是给实现享元提供的接口
 *
 * 具体享元（concreateFlyweight)角色：实现抽象角色，次对象必须是共享的，所含的状态必须是内部状态。
 *
 * 不共享享元（UnSharedConcreateFlyweight)角色：此对象不可共享，不是所有实现抽象共享接口的对象都要共享，此对象通常将ConreateFlyweight作为组成元素。
 *
 * 享元工厂（FlyweightFactory)角色：负责床架和管理享元角色，确保合理共享。
 *
 * 客户端（client)角色:维持一个Flyweight对象的引用，计算或存储一个（多个）外部存储状态。
 */
public class Main {
    public static void main(String[] args) {
        Row r = new Row();
        GlyphFactory factory = new GlyphFactory();
        Context context = new Context(12, 'a');
        Glyph glyph = factory.getGlyph(context);
        r.setCharacter(glyph);

        Context context2 = new Context(13, 'a');
        Glyph glyph2 = factory.getGlyph(context2);
        r.setCharacter(glyph2);

        Context context3 = new Context(13, 'b');
        Glyph glyph3 = factory.getGlyph(context3);
        r.setCharacter(glyph3);

        System.out.println(r.getRow());
    }
}
