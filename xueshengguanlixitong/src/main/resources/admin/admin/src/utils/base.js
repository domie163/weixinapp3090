const base = {
    get() {
        return {
            url : "http://localhost:8080/xueshengguanlixitong/",
            name: "xueshengguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xueshengguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生管理系统"
        } 
    }
}
export default base
