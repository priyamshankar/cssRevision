import React from "react";
import { useSelector,useDispatch } from "react-redux";
import { actionCreators } from "../state/index";

const BtnComponents = () => {
  const store = useSelector((state) => state.add);
  const dispatch = useDispatch();

  return (
    <div>
      btn
      <button onClick={()=>{dispatch(actionCreators.depositMoney(100))}}>Click to increment {store}</button>
    </div>
  );
};

export default BtnComponents;
