package com;


import cn.org.rapid_framework.generator.GeneratorFacade;

public class Generator
{
    public static void main(String[] args)
    {
        try
        {
            GeneratorFacade g = new GeneratorFacade();
            g.deleteOutRootDir();
            g.generateByTable("rec_folder", "templates");
            //g.generateByTable("sys_auth_group_access","templates");
            //g.generateByAllTable("templates");
           // g.generateByMap();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
