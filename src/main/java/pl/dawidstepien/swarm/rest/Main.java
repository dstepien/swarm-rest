package pl.dawidstepien.swarm.rest;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class Main {

  public static void main(String[] args) throws Exception {
    Swarm swarm = new Swarm();
    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
    deployment.addResource(HelloWorldEndpoint.class);
    swarm.start();
    swarm.deploy(deployment);
  }
}
