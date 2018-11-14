package edu.itq.iptv;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.engine.ServiceLifeCycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IPtvSpringInit implements ServiceLifeCycle{

    @Override
    public void startUp(final ConfigurationContext configctx, final AxisService service) {
        // TODO Auto-generated method stub
       ClassLoader classLoader = service.getClassLoader();
       ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext(new String[] {"META-INF/context.xml"},false);
       appCtx.setClassLoader(classLoader);
       appCtx.refresh();
    }

    @Override
    public void shutDown(ConfigurationContext configctx, AxisService service) {
        // TODO Auto-generated method stub
        
    }

}