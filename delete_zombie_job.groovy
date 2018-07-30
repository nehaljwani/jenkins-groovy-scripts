jobName = "i-am-zombie"
buildNumber = 42
Jenkins.instance.getItemByFullName(jobName).getBuildByNumber(buildNumber).delete()
