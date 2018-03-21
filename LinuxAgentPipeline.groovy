import jenkins.model.*
import hudson.model.*
import hudson.slaves.*
import hudson.plugins.sshslaves.*
import java.util.ArrayList;

Slave slave = new DumbSlave(Name,description,Slave_path,noofexecutors,Node.Mode.NORMAL,
                    Labels,new SSHLauncher(Host,22,root,pass," "," "," "," "," "),
                    new RetentionStrategy.Always())
 Jenkins.instance.addNode(slave)