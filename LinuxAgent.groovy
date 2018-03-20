import jenkins.model.*
import hudson.model.*
import hudson.slaves.*
import hudson.plugins.sshslaves.*
import java.util.ArrayList;
import hudson.slaves.EnvironmentVariablesNodeProperty.Entry;

  Slave slave = new DumbSlave(
                    "agent-node","Agent node description",
                    "/home/daksha",
                    "1",
                    Node.Mode.NORMAL,
                    "agent-node-label",
                    new SSHLauncher("10.11.28.124",22,"root","root123","","","","",""),
                    new RetentionStrategy.Always())
  Slave slave1 = new DumbSlave(
                    "agent-node1","Agent node description",
                    "/home/daksha",
                    "2",
                    Node.Mode.NORMAL,
                    "agent-node-label",
                    new SSHLauncher("10.11.28.124",22,"root","root123","","","","",""),
                    new RetentionStrategy.Always())
         Jenkins.instance.addNode(slave)
		 Jenkins.instance.addNode(slave1)