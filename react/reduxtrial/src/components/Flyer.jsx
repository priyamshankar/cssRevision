import React from 'react'
import { useSelector } from "react-redux";

export const Flyer = () => {
    const store = useSelector((state) => state.add);

  return (<>
    
        <div>inc value {store}.</div>
  </>
  )
}

export default Flyer;
