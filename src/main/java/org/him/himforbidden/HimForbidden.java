package org.him.himforbidden;

import org.bukkit.plugin.java.JavaPlugin;

public final class HimForbidden extends JavaPlugin {
    public static HimForbidden wwgs;

    @Override
    public void onEnable() {
        System.out.println("§c§l一个死妈小学生狗屎正在找我们麻烦");
        System.out.println("§c------------------------------------------------------------------"+
                "§c傻狗简介"+"§c------------------------------------------------------------------");
        System.out.println("§a§l来自东北的某个野狗,此狗在him评论区到处意淫,还拿自己父母\n" +
                "§a§l骨灰到处瞎操!后来竟发现是猪神的大孝子,带着他狗爹到him的\n" +
                "§a§l评论区到处艾特族谱,率领水军恶心him,拿him的头像使用暴走p图进行\n" +
                "§a§l人身攻击,造谣him,恶意举报,这个傻逼每亩屎狗谁瞧得起");
        getLogger().info("§b死妈狗屎玩意的b站：普吉弹簧反迷你");
        getLogger().info("§a此狗手机号：17745696642");
        getLogger().info("§f§l此狗qq:2560349071");
        wwgs = this;

        System.out.println("\n"
                +" _    _ _____ __  __ \n" +
                "| |  | |_   _|  \\/  |\n" +
                "| |__| | | | | \\  / |\n" +
                "|  __  | | | | |\\/| |\n" +
                "| |  | |_| |_| |  | |\n" +
                "|_|  |_|_____|_|  |_|");
        System.out.println("§2作者him的QQ:715387640");
        System.out.println("§c§l群号：139865381");

        getLogger().info("§e------------------------------------------------------------------" +
                "§ehim系列插件加载中" +
                "§e------------------------------------------------------------------");
        System.out.println("§c§l实名上网赵梁树");
        System.out.println("§ahimB站：Technology_him");
        System.out.println("§2§lweixin：wxid_7xwte2bel3k022");

        getCommand("hfreload").setExecutor(new reload());

        getServer().getPluginManager().registerEvents(new jyevents(), this);

        wwgs.getConfig().options().copyDefaults(true);
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("§b某死妈狗屎小学生b站：普吉弹簧反迷你");
        getLogger().info("§a手机号：17745696642");
        getLogger().info("§f§l此狗qq:2560349071");
        System.out.println("§c------------------------------------------------------------------"+
                "§c傻狗简介"+"§c------------------------------------------------------------------");
        System.out.println("§a§l来自东北的某个野狗,此狗在him评论区到处意浮,还拿自己父母\n" +
                "§a§l骨灰到处瞎操!后来竟发现是猪神的大孝子,带着他狗爹到him的\n" +
                "§a§l评论区到处艾特族谱,率领水军网暴him,拿him的头像使用暴走p图进行\n" +
                "§a§l人身攻击,造谣him,恶意举报,这个傻逼每亩屎狗谁瞧得起");
        System.out.println("\n"
                +" _    _ _____ __  __ \n" +
                "| |  | |_   _|  \\/  |\n" +
                "| |__| | | | | \\  / |\n" +
                "|  __  | | | | |\\/| |\n" +
                "| |  | |_| |_| |  | |\n" +
                "|_|  |_|_____|_|  |_|");
        System.out.println("§2作者him的QQ:715387640");
        System.out.println("§c§l群号：139865381");

        getLogger().info("§e------------------------------------------------------------------" +
                "§ehim系列插件卸载中" +
                "§e------------------------------------------------------------------");
        System.out.println("§c§l实名上网赵梁树");
        System.out.println("§ahimB站：Technology_him");
        System.out.println("§2§lweixin：wxid_7xwte2bel3k022");


    }
}
