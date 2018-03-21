import jenkins.model.*
import hudson.model.*
import hudson.slaves.*
import hudson.plugins.sshslaves.*
import java.util.ArrayList;


def Name = ${env.Name};
def description = ${env.description};
def Slave_path =  ${env.Slave_path};
def noofexecutors = ${env.noofexecutors};
def Labels = ${env.Labels};
def Host = ${env.Host};
def User = ${env.User};
def pass = ${env.pass};


Slave slave = new DumbSlave(Name,description,Slave_path,noofexecutors,Node.Mode.NORMAL,
                    Labels,new SSHLauncher(Host,22,User,pass," "," "," "," "," "),
                    new RetentionStrategy.Always())
 Jenkins.instance.addNode(slave)