class CommonService{


    constructor(){
        console.log('Created common Service');
    }

    get expenseType():string[]{
        const expenseTypeList= ['BroadBand','Power','Transport','Food'];
        return expenseTypeList;
    }
}