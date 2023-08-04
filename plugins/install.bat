@rem 将本插件安装到中央仓库，便于其他项目使用
call mvn install:install-file -Dfile="./ohMyMojo.jar" -DgroupId="co.zhanglintc.plugins" -DartifactId="ohMyMojo-plugin" -Dversion="1.0" -Dpackaging="jar" -DgeneratePom="true" -DcreateChecksum="true"

@echo press any key to close...
@pause > nul
