import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ListaJednorozcowTest {
    @Test
    public void getListaJednorozcow() throws Exception {
    }

    @Test
    public void setListaJednorozcow() throws Exception {
    }

    @Test
    public void dodajJednorozca() throws Exception {
    }

    @Test
    public void sprzedajJednororzca() throws Exception {
    }

    @Test
    public void wyswietlJednorozce() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ListaJednorozcow.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
