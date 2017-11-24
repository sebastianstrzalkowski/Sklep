import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ListaSprzedajacychTest {
    @Test
    public void getListaSprzedających1() throws Exception {
    }

    @Test
    public void setListaKupujacych1() throws Exception {
    }

    @org.junit.Test
    public void getListaSprzedających() throws Exception {
    }

    @org.junit.Test
    public void setListaKupujacych() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ListaSprzedajacych.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
