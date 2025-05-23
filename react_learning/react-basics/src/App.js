import './App.css';
import ClassComponent from './components/ClassComponent';
import FunctionalComponent from './components/FunctionalComponent';
import FunctionComponentUsingArrowFunction from './components/FunctionComponentUsingArraowFunction';
import OnChangeExample from './events/OnChangeExample';
import OnClickExample from './events/OnClickExample';
import OnKeyDownExample from './events/OnKeyDownExample';
// import OnMouseOverExample from './events/OnMouseOverExample';
import OnSubmitExample from './events/OnSubmitExample';
import UseContextExample from './hooks/use-context-hook/UseContextExample';
import UseCallBackExample from './hooks/UseCallBackExample';
import UseEffectExample from './hooks/UseEffectExample';
import UseFormExample from './hooks/UseFormExample';
import UseMemoExample from './hooks/UseMemoExample';
import UseReducerExample from './hooks/UseReducerExample';
import UseRefExample from './hooks/UseRefExample';
import UseStateExample from './hooks/UseStateExample';
import PropsClassComponent from './props/PropsClassComponent';
import PropsFunctionalComponent from './props/PropsFunctionalComponent';
import PropsFunctionalComponentArrow from './props/PropsFunctionalComponentArrow';
import StateClassComponent from './state/StateClassComponent';
import StateFunctionalComponent from './state/StateFunctionalComponent';
import { StateFunctionComponentArrow } from './state/StateFunctionComponentArrow';

function App() {
  return (
    <div className="App">
      <h4>First React App</h4>

      <div className='first-css'>
        <h4>Component Types</h4>
        <ClassComponent />
        <FunctionalComponent />
        <FunctionComponentUsingArrowFunction />
      </div>

      <div className='first-css'>
        <h4>Props Examples</h4>
        <PropsFunctionalComponent name={"Nani"} age={26} />
        <PropsClassComponent companyName={"HTC Global Service"} salary={80000.50} />
        <PropsFunctionalComponentArrow technology={"Java"} years={3.5} />
      </div>
      <div className='first-css'>
        <h4>State Examples</h4>
        <StateClassComponent />
        <StateFunctionalComponent />
        <StateFunctionComponentArrow />
      </div>

      <div className='first-css'>
        <h4>Events Examples</h4>
        <OnClickExample />
        <OnChangeExample /> <br></br>
        <OnSubmitExample />
        {/* // enable it if you want to see its example */}
        {/* <OnMouseOverExample />  */}
        <OnKeyDownExample />
      </div>

      <div className='first-css'>
        <h4>HOOKS In React</h4>
        <UseStateExample /> 
        <UseEffectExample />
        <UseRefExample />
        <UseContextExample />
        <UseReducerExample />
        <UseMemoExample />
        <UseCallBackExample/>
        <UseFormExample/>
      </div>
      <div className='first-css'>
        <h4>REACT ROUTERS</h4>
      </div>
    </div>
  );
}

export default App;
