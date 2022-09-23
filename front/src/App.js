import './App.css';
import Studenttable from './components/Table/Studenttable';
import {Layout} from 'antd';

function App() {
  return (
    <div className="App">
    <Layout
          className="site-layout-background"
          style={{
            padding: 24,
            margin: 0,
            minHeight: 280,
          }}
        >
          Content
        
      <h1>List of Student</h1>
      <Studenttable/>
      </Layout>
    </div>
  );
}

export default App;
