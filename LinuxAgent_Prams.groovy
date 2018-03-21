import jenkins.model.*
import hudson.model.*
import hudson.slaves.*
import hudson.plugins.sshslaves.*
import java.util.ArrayList;


def Name = build.buildVariableResolver.resolve('Name');
def description = build.buildVariableResolver.resolve('description');
def Slave_path =  build.buildVariableResolver.resolve('Slave_path');
def noofexecutors = build.buildVariableResolver.resolve('noofexecutors');
def Labels = build.buildVariableResolver.resolve('Labels');
def Host = build.buildVariableResolver.resolve('Host');
def User = build.buildVariableResolver.resolve('User');
def pass = build.buildVariableResolver.resolve('pass');


Slave slave = new DumbSlave(Name,description,Slave_path,noofexecutors,Node.Mode.NORMAL,
                    Labels,new SSHLauncher(Host,22,User,pass," "," "," "," "," "),
                    new RetentionStrategy.Always())
 Jenkins.instance.addNode(slave)